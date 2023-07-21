Moon	"Org/Lercurnis III II"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            0.002
	Radius          932.2
	InertiaMoment   0.39678
	Oblateness      0.0013817
	Obliquity       3
	EqAscendNode    0
	TidalLocked     true

	Albedo          0.72
	Brightness      1
	BrightnessReal  1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Subglacial"
		Panspermia true
	}

	Surface
	{
		Preset         "lercurnis_flank_org.cfg"
		SurfStyle       0.76488
		Randomize      (-0.490, -0.338, 0.705)
		colorDistMagn   0.082667
		colorDistFreq   106.47
		detailScale     128
		drivenDarkening 0
		seaLevel        0.15
		snowLevel       2
		tropicLatitude  0.34085
		icecapLatitude  2
		icecapHeight    0.008557
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.15427
		heightTempGrad  0.625
		beachWidth      0.0012235
		tropicWidth     0.07
		mainFreq        2.6336
		venusFreq       1.2366
		venusMagn       0.91603
		mareFreq        0.5
		mareDensity     1
		terraceProb     0.41982
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      2.9912
		riversSin       5.8437
		riftsMagn       25
		riftsFreq       2.1374
		riftsSin        10
		eqridgeMagn     0.045802
		eqridgeWidth    1
		eqridgeModMagn  1.584
		eqridgeModFreq  10
		canyonsMagn     0
		canyonsFreq     0.28917
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      2
		cracksOctaves   15
		craterMagn      0.5
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.2
		volcanoFreq     1.3435
		volcanoDensity  0.38931
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.61069
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      50
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.26718
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.41221
		RoughnessScale  0.9313
		Hapke           0.5
		SpotBright      3.5115
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      2.19164932
		SemiMajorAxisKm 142700.342
		Eccentricity    0.00152671756
		Inclination     3
		AscendingNode   129.160305
		ArgOfPericenter 112.671756
		MeanAnomaly     0
	}
}

