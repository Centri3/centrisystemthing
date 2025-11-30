DwarfMoon	"Bors I/Lercurnis B VII B-I"
{
	ParentBody     "Pel"
	Class          "Terra"
	Mass            9.99999975e-05
	Radius          321.570007
	InertiaMoment   0.397500008
	Obliquity       1
	EqAscendNode    -178.625954
	TidalLocked     true

	Albedo          0.9
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel_bors_i.cfg"
		SurfStyle       0.144
		Randomize      (-0.379, -0.361, -0.594)
		colorDistMagn   0.0512
		colorDistFreq   47
		detailScale     128
		drivenDarkening 0.252
		seaLevel        -0.107
		snowLevel       2
		tropicLatitude  0.0175
		icecapLatitude  0.8
		icecapHeight    0
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.39
		heightTempGrad  0.625
		beachWidth      0.000923
		tropicWidth     0.07
		mainFreq        0.687
		venusFreq       1.01
		venusMagn       0.534
		mareFreq        0.5
		mareDensity     0
		terraceProb     0.434
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0293
		dunesFreq       2.41
		dunesFraction   0.443
		hillsMagn       0.3
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      57.4
		riversFreq      3.29
		riversSin       7.5
		riftsMagn       16.8
		riftsFreq       1.84
		riftsSin        6.1
		eqridgeMagn     0.305
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  2.37
		canyonsMagn     0.46
		canyonsFreq     0.101
		canyonsFraction 0.333
		cracksMagn      0.0576
		cracksFreq      0.0939
		cracksOctaves   0
		craterMagn      0.4
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.481
		volcanoMagn     0
		volcanoFreq     1.36
		volcanoDensity  0.0763
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.382
		volcanoTemp     2.11e+03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.1
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      9.55830576
		SemiMajorAxisKm 1391609.21
		Eccentricity    0.1
		Inclination     1
		AscendingNode   -178.625954
		ArgOfPericenter 228.091603
		MeanAnomaly     24.7328244
	}
}

