Moon	"Foc/Lercurnis II I"
{
	ParentBody     "Don"
	Class          "Aquaria"
	Mass            0.0018275
	Radius          1007.8
	InertiaMoment   0.39917
	Oblateness      0.0061099
	Obliquity       4
	EqAscendNode    41.221
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
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
		Preset         "lercurnis_don_foc.cfg"
		SurfStyle       0.12792
		Randomize      (-0.898, 0.822, 0.507)
		colorDistMagn   0.042941
		colorDistFreq   120.14
		detailScale     128
		drivenDarkening 0.16031
		seaLevel        -0.12977
		snowLevel       2
		tropicLatitude  0.37581
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
		humidity        0.32178
		heightTempGrad  0.625
		beachWidth      0.00078457
		tropicWidth     0.07
		mainFreq        1.9074
		venusFreq       1.3558
		venusMagn       2.0992
		mareFreq        0.5
		mareDensity     1
		terraceProb     0.16364
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.023906
		dunesFreq       8.3625
		dunesFraction   0.070688
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      3.657
		riversSin       4.8852
		riftsMagn       15
		riftsFreq       5.3435
		riftsSin        10
		eqridgeMagn     0.32824
		eqridgeWidth    1
		eqridgeModMagn  1.9084
		eqridgeModFreq  10
		canyonsMagn     0.62274
		canyonsFreq     0.31218
		canyonsFraction 0
		cracksMagn      0
		cracksFreq      0
		cracksOctaves   0
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.35
		volcanoFreq     1.1756
		volcanoDensity  0.25191
		volcanoOctaves  5
		volcanoActivity 0
		volcanoFlows    0
		volcanoRadius   1
		volcanoTemp     0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.77099
		SpotBright      2.5
		SpotWidth       0.05
		SpotBrightCB    2.5
		SpotWidthCB     0.05
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
		PeriodDays      1.23101723
		SemiMajorAxisKm 102962.38
		Eccentricity    0.01
		Inclination     4
		AscendingNode   41.221374
		ArgOfPericenter 35.7251908
		MeanAnomaly     0
	}
}

