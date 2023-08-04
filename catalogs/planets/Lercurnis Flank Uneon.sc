Moon	"Uneon/Lercurnis III III"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            0.0012125
	Radius          880.05
	InertiaMoment   0.39745
	Obliquity       0.2
	EqAscendNode    46.718
	TidalLocked     true

	Albedo          0.2
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_flank_uneon.cfg"
		SurfStyle       0.50418
		Randomize      (-0.944, -0.529, 0.439)
		colorDistMagn   0.050081
		colorDistFreq   102.44
		detailScale     128
		drivenDarkening 0
		seaLevel        -0.038168
		snowLevel       2
		tropicLatitude  0.2912
		icecapLatitude  2
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.40615
		heightTempGrad  0.625
		beachWidth      0.00098257
		tropicWidth     0.07
		mainFreq        1.6426
		venusFreq       2
		venusMagn       0.87786
		mareFreq        1
		mareDensity     1
		terraceProb     0.32189
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.025555
		dunesFreq       8.0913
		dunesFraction   0.083932
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      3.7944
		riversSin       6.4761
		riftsMagn       5
		riftsFreq       1.4504
		riftsSin        7.7863
		eqridgeMagn     0.1
		eqridgeWidth    1
		eqridgeModMagn  1.5458
		eqridgeModFreq  10
		canyonsMagn     0
		canyonsFreq     0
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      15
		cracksOctaves   15
		craterMagn      0.4
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.23664
		volcanoFreq     1.7252
		volcanoDensity  0.19084
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   0.38931
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      50
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.73282
		SpotBright      2.5
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
		PeriodDays      5.21454433
		SemiMajorAxisKm 254316.38
		Eccentricity    0.0001
		Inclination     0.2
		AscendingNode   46.7175573
		ArgOfPericenter -30.2290076
		MeanAnomaly     -134.656489
	}
}

