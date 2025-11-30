DwarfMoon	"Bors IV/Lercurnis B VII B-IV"
{
	ParentBody     "Pel"
	Class          "Terra"
	Mass            3.9999999e-05
	Radius          237.130005
	InertiaMoment   0.398649991
	Oblateness     (0.347, 0.531, 0.000)
	Obliquity       1
	EqAscendNode    -206.10687
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_pel_bors_iv.cfg"
		SurfStyle       0.652
		Randomize      (0.738, 0.467, -0.459)
		colorDistMagn   0.0926
		colorDistFreq   28.8
		detailScale     128
		drivenDarkening 0.176
		seaLevel        0.094
		snowLevel       2
		tropicLatitude  0.000175
		icecapLatitude  2
		icecapHeight    0.58
		climatePole     0.438
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.32
		heightTempGrad  0.625
		beachWidth      0.000991
		tropicWidth     0.07
		mainFreq        0.534
		venusFreq       0.824
		venusMagn       1.76
		mareFreq        0
		mareDensity     0.168
		terraceProb     0.365
		erosion         0
		montesMagn      0.07
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.0269
		dunesFreq       1.75
		dunesFraction   0.994
		hillsMagn       0.3
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      59.4
		riversFreq      3.04
		riversSin       7.23
		riftsMagn       40.5
		riftsFreq       2.54
		riftsSin        5.94
		eqridgeMagn     0.313
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  2.44
		canyonsMagn     0.365
		canyonsFreq     0.0709
		canyonsFraction 0.993
		cracksMagn      0.061
		cracksFreq      0.125
		cracksOctaves   0
		craterMagn      0.1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0.13
		volcanoMagn     0
		volcanoFreq     2
		volcanoDensity  1
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.557
		volcanoTemp     3e+03
		lavaCoverTidal  0.124
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      88.4
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
		PeriodDays      0.336825727
		SemiMajorAxisKm 149597.871
		Eccentricity    0.02
		Inclination     1
		AscendingNode   -206.10687
		ArgOfPericenter 24.7328244
		MeanAnomaly     -186.5
	}
}

